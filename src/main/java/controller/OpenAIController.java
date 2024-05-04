package controller;

import RAG.Assistant;
import RAG.RAGConfiguration;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.image.ImageModel;
import dev.langchain4j.model.input.Prompt;
import dev.langchain4j.model.input.structured.StructuredPromptProcessor;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiImageModel;
import dto.MyQuestion;
import dto.MyStructuredTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.util.Arrays;

@RestController
@CrossOrigin("*")
public class OpenAIController {

    @Value("${OPENAI_KEY_PREMIUM}")
    private String apiKey;

    @Autowired
    private RAGConfiguration config;

    private Assistant assistente;

    @Autowired
    private ChatLanguageModel chatModel;

    @PostMapping("/answer")
    public String chatWithOpenAI(@RequestBody MyQuestion question) {
        ChatLanguageModel customModel = new OpenAiChatModel.OpenAiChatModelBuilder()
                .apiKey(apiKey)
                .modelName("gpt-3.5-turbo")
                .temperature(0.6)
                .build();

        return customModel.generate(question.question());


    }

    @GetMapping("/receita")
    public String facaUmaReceita() {
        MyStructuredTemplate template = new MyStructuredTemplate();
        MyStructuredTemplate.PromptDeReceita rcPrompt = new MyStructuredTemplate.PromptDeReceita();
        rcPrompt.prato = "Assado";
        rcPrompt.ingredientes = Arrays.asList("carne", "tomate", "cebola", "pimentao");

        Prompt prompt = StructuredPromptProcessor.toPrompt(rcPrompt);

        return chatModel.generate(prompt.text());
    }

    @PostMapping("/imagem")
    public String generateImage(@RequestBody MyQuestion question) {
        try {
            ImageModel imageModel = new OpenAiImageModel.OpenAiImageModelBuilder().apiKey(apiKey).modelName("dall-e").build();
            return imageModel.generate(question.question()).content().url().toURL().toString();
        } catch (Exception ex) {
            return null;
        }
    }

    @PostMapping("/chatwithrag")
    public String conversarViaRAG(@RequestBody MyQuestion question) {
        try {
            if (assistente == null) {
                assistente = config.configure();
            }
            return assistente.anwser(question.question());

        } catch (Exception ex) {
            return "Impossivel responder isso";
        }
    }

    @PostMapping("/chatollama")
    public String chatWithOllama(@RequestBody MyQuestion question) {
        ChatLanguageModel ollamaChat = new OllamaChatModel.OllamaChatModelBuilder()
                .baseUrl("http://localhost:11434")
                .modelName("llama3")
                .timeout(Duration.ofSeconds(300))
                .build();
        return ollamaChat.generate(question.question());
    }

}


