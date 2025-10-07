import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderDetailsService {
  API = "http://localhost:8080";

  constructor(private http: HttpClient) {}

  // Register a new order
  public registerOrder(orderData: any) {
    return this.http.post(`${this.API}/orderdetails`, orderData); 
  }

  // Get all orders
  public getOrders() {
    return this.http.get(`${this.API}/orderdetails`); 
  }

  // Delete an order by ID
  public deleteOrder(orderId: number) {
    
    return this.http.delete(`${this.API}/orderdetails/${orderId}`); 
  }

  // Update an order
  public updateOrder(order: any) {
    const orderId = order.id || order.orderId; 
    return this.http.put(`${this.API}/orderdetails/${orderId}`, order); 
  }
}
