package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);//new Date(); atribui o horario atual, de acordo com a regiao do computador

		System.out.println(order);
		order.setStatus(OrderStatus.DELIVERED);
		System.out.println();
		System.out.println(order);
		order.setStatus(OrderStatus.valueOf("SHIPPED"));//metodo utilizado para converter string para o tipo enum, correspondentes aos estados definidos na classe(usar esse metodo quando for digitar do teclado o estado de alguma variavel enum, por exemplo)
		System.out.println();
		System.out.println(order);
	}

}
