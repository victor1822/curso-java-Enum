package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer id; //id do pedido
	private Date moment; //momento do pedido 
	private OrderStatus status; // estado do pedido

	//construtor
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	//toString para imprimir os atributos da classe com maior facilidade
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}

}
