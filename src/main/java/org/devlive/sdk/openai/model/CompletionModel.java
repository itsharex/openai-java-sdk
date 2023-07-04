package org.devlive.sdk.openai.model;

public enum CompletionModel
{
    TEXT_DAVINCI_003("text-davinci-003",
            "Most capable model in the GPT-3 series. Can perform any task the other GPT-3 models can, often with higher quality, longer output and better instruction-following. It can process up to 4,000 tokens per request.",
            "Complex intent, cause and effect, creative generation, search, summarization for audience",
            4096),
    TEXT_CURIE_001("text-curie-001",
            "Very capable, but faster and lower cost than text-davinci-003.",
            "Language translation, complex classification, sentiment, summarization",
            2049);

    private final String name;
    private final String description;
    private final String strengths;
    private final int maxTokens;

    CompletionModel(String name, String description, String strengths, int maxTokens)
    {
        this.name = name;
        this.description = description;
        this.strengths = strengths;
        this.maxTokens = maxTokens;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getStrengths()
    {
        return strengths;
    }

    public int getMaxTokens()
    {
        return maxTokens;
    }
}