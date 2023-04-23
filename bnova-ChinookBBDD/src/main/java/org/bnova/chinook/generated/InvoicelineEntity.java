package org.bnova.chinook.generated;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "invoiceline", schema = "chinook", catalog = "")
public class InvoicelineEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "InvoiceLineId")
    private int invoiceLineId;

    public int getInvoiceLineId() {
        return invoiceLineId;
    }

    public void setInvoiceLineId(int invoiceLineId) {
        this.invoiceLineId = invoiceLineId;
    }

    @Basic
    @Column(name = "InvoiceId")
    private int invoiceId;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @Column(name = "TrackId")
    private int trackId;

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    @Basic
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "Quantity")
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoicelineEntity that = (InvoicelineEntity) o;
        return invoiceLineId == that.invoiceLineId && invoiceId == that.invoiceId && trackId == that.trackId && quantity == that.quantity && Objects.equals(unitPrice, that.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceLineId, invoiceId, trackId, unitPrice, quantity);
    }
}
