package dto;

import dev.langchain4j.model.input.structured.StructuredPrompt;

import java.util.List;

public class MyStructuredTemplate {
    @StructuredPrompt({
            "Crie uma receita de {{prato}} que possa ser preparada usando somente {{ingredientes}}",
            "Estruture a sua resposta da seguinte forma:",
            "Nome da Receita: ...",
            "Descricao: ...",
            "Tempo de Preparo: ...",
            "Ingredientes Necessarios:",
            "- ...",
            "- ...",
            "Modo de Preparo:",
            "- ...",
            "- ..."
    })
    public static class PromptDeReceita{
        public String prato;
        public List<String> ingredientes;
    }

}

