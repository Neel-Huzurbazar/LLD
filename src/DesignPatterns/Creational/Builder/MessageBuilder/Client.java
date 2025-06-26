package DesignPatterns.Creational.Builder.MessageBuilder;

public class Client {
    public static void main(String[] args) {
        MessageBuilder messageBuilder = MessageBuilder.getBuilder().setSenderEmailAddress("test@test.com")
                .setReceiverEmailAddress("test1@test.com")
                .setMessage("Testing builder pattern")
                .setContentType("text")
                .build();
        System.out.println(messageBuilder);
    }
}
