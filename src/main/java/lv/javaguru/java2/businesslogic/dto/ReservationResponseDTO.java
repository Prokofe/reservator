package lv.javaguru.java2.businesslogic.dto;

import lv.javaguru.java2.businesslogic.Error;

import java.time.LocalDateTime;
import java.util.List;

public class ReservationResponseDTO {

    private List<Error> errors;
    private int tableId;
    private LocalDateTime reservationTime;

    public ReservationResponseDTO(List<Error> errors, int tableId, LocalDateTime reservationTime) {
        this.errors = errors;
        this.tableId = tableId;
        this.reservationTime = reservationTime;
    }

    public ReservationResponseDTO() {
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }


}
