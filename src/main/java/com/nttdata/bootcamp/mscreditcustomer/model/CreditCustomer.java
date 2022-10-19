package com.nttdata.bootcamp.mscreditcustomer.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CreditCustomer {
	
	private Long creditId;
	private Integer productId;
	private String numberAccount; //numero de tarjeta
	private String quantityFee; // cantidad de cuotas
	private BigDecimal initialBalance; // Monto inicial
	private BigDecimal remainingBalance; // Monto Restante
	private Integer customerId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
}
