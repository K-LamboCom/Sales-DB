package klambo.salesdb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "sales_orders")
@AllArgsConstructor
@NoArgsConstructor
public class SalesOrder extends BaseEntity {

    @Column(name = "order_code", nullable = false, unique = true, length = 50)
    private String orderCode;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "delivery_date")
    private LocalDateTime deliveryDate;

    @Column(name = "total_amount", nullable = false)
    private int totalAmount;

    @Column(name = "discount_amount")
    private int discountAmount;

    @Column(name = "tax_amount")
    private int taxAmount;

    @Column(name = "note", columnDefinition = "TEXT")
    private String note;

//    @OneToMany(mappedBy = "salesOrder", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<SalesOrderItem> items = new ArrayList<>();

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "customer_id", nullable = false)
//    private Customer customer;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "status", nullable = false, length = 20)
//    private OrderStatus status;
}
