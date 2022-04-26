package com.fakecompany.customers;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

interface CustomerRepository  extends JpaRepository<Customer, Long> {

  @Query ("SELECT PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Telefono, Direccion, CiudadResidencia FROM Customer WHERE cedula = :docNumber ")
  Customer findByCedula( @Param("docNumber") String docNumber);
  
  @Query ("SELECT PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Telefono, Direccion, CiudadResidencia FROM Cliente WHERE pasaporte = :docNumber ")
  Customer findByPasaporte( @Param("docNumber") String docNumber);

}
