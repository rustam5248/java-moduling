package dto;

import java.time.LocalDate;

public class Subscription {

    private String bankcardNumber;

    private LocalDate startDate;

    private boolean isActive;

    public Subscription(String bankcardNumber, LocalDate startDate) {
        this.bankcardNumber = bankcardNumber;
        this.startDate = startDate;
    }

    public String getBankcardNumber() {
        return bankcardNumber;
    }

    public void setBankcardNumber(String bankcardNumber) {
        this.bankcardNumber = bankcardNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
