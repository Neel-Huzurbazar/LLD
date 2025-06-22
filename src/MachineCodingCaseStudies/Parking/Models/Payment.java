package MachineCodingCaseStudies.Parking.Models;

import java.util.Date;

public class Payment extends BaseModel{
    Date time;
    int paidAmount;
    long referenceNumber;
    PaymentStatus paymentStatus;
    PaymentMode paymentMode;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public long getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(long referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}
