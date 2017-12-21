package com.techprimers.blockchain;

public class Transaction {

    private String sourceName;
    private String destinationName;
    private Long sum;

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public Transaction(String sourceName, String destinationName, Long sum) {
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (sourceName != null ? !sourceName.equals(that.sourceName) : that.sourceName != null) return false;
        if (destinationName != null ? !destinationName.equals(that.destinationName) : that.destinationName != null)
            return false;
        return sum != null ? sum.equals(that.sum) : that.sum == null;
    }

    @Override
    public int hashCode() {
        int result = sourceName != null ? sourceName.hashCode() : 0;
        result = 31 * result + (destinationName != null ? destinationName.hashCode() : 0);
        result = 31 * result + (sum != null ? sum.hashCode() : 0);
        return result;
    }
}
