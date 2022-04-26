package com.fakecompany.customers;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
    private @Id @GeneratedValue Long id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String direccion;
    private String ciudadResidencia;
    private String cedula;
    private String pasaporte;

    Customer() {}

    Customer(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String direccion, String ciudadResidencia, String cedula, String pasaporte) {

        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudadResidencia = ciudadResidencia;
        this.cedula = cedula;
        this.pasaporte = pasaporte;
    }

    //getters
    public Long getId() {
        return this.id;
    }

    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getCiudadResidencia() {
        return this.ciudadResidencia;
    }

    public String getCedula() {
        return this.cedula;
    }

    public String getPasaporte() {
        return  this.pasaporte;
    }

    //setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundopellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Customer))
            return false;

        Customer customer = (Customer) o;
        return Objects.equals(this.id, customer.id) && Objects.equals(this.primerNombre, customer.primerNombre)
                && Objects.equals(this.segundoNombre, customer.segundoNombre)
                && Objects.equals(this.primerApellido, customer.primerApellido)
                && Objects.equals(this.segundoApellido, customer.segundoApellido)
                && Objects.equals(this.telefono, customer.telefono)
                && Objects.equals(this.direccion, customer.direccion)
                && Objects.equals(this.ciudadResidencia, customer.ciudadResidencia)
                && Objects.equals(this.cedula, customer.cedula)
                && Objects.equals(this.pasaporte, customer.pasaporte);
    }

}
