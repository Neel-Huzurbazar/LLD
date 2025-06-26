package DesignPatterns.Creational.Builder.MessageBuilder;

public class MessageBuilder {
    private String senderEmailAddress;
    private String receiverEmailAddress;
    private String message;
    private String contentType;

    @Override
    public String toString() {
        return "MessageBuilder{" +
                "senderEmailAddress='" + senderEmailAddress + '\'' +
                ", receiverEmailAddress='" + receiverEmailAddress + '\'' +
                ", message='" + message + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }

    public static class Builder{
        private String senderEmailAddress;

        public String getSenderEmailAddress() {
            return senderEmailAddress;
        }

        public String getReceiverEmailAddress() {
            return receiverEmailAddress;
        }

        public String getMessage() {
            return message;
        }

        public String getContentType() {
            return contentType;
        }

        private String receiverEmailAddress;
        private String message;
        private String contentType;

        public Builder setSenderEmailAddress(String senderEmailAddress) {
            this.senderEmailAddress = senderEmailAddress;
            return this;
        }

        public Builder setReceiverEmailAddress(String receiverEmailAddress) {
            this.receiverEmailAddress = receiverEmailAddress;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public MessageBuilder build()
        {
            return new MessageBuilder(this);
        }
    }

    private MessageBuilder(Builder builder)
    {
        this.senderEmailAddress=builder.getSenderEmailAddress();
        this.receiverEmailAddress=builder.getReceiverEmailAddress();
        this.message=builder.getMessage();
        this.contentType =builder.getContentType();
    }

    public static Builder getBuilder()
    {
        return new Builder();
    }
}
