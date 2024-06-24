package Endpoints;

import java.math.BigDecimal;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import https.registro_uv_mx.contabilidad.PagoRequest;
import https.registro_uv_mx.contabilidad.PagoResponse;
import https.registro_uv_mx.contabilidad.PagoAprobadoResponse;
import https.registro_uv_mx.contabilidad.GetAllPagosAprobadosRequest;
import https.registro_uv_mx.contabilidad.GetAllPagosAprobadosResponse;
import https.registro_uv_mx.contabilidad.PagoAprobadoRequest;

@Endpoint
public class ContabilidadEndpoint {

    private static final String NAMESPACE_URI = "https://registro.uv.mx/contabilidad";
    //Checar si se puede hacer un pago segun la afectacion presupuestal de una dependencia
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PagoRequest")
    @ResponsePayload
    public PagoResponse handlePagoRequest(@RequestPayload PagoRequest request){
        PagoResponse response = new PagoResponse();
        BigDecimal total =BigDecimal.valueOf(request.getCantidad()).multiply(request.getPrecio());
        System.out.println("El total de gasto es de: "+total);
        //presupuestos 
        //response.setSuccess(afectacionPresupuestalRequest(request.getIdDependencia,total));
        //
        if(response.isSuccess()){
            //ingresar a la base de datos el pago aprobado por presupuestos usando post
        }
        return response;
    }
    //Checar si un folio fue aprobado por presupuesto
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PagoAprobadoRequest")
    @ResponsePayload
    public PagoAprobadoResponse manejarPagoAprobadoRequest(@RequestPayload PagoAprobadoRequest request){
        PagoAprobadoResponse response = new PagoAprobadoResponse();
        request.getFolio();
        //La query usa el folio del request para buscar si esta
        return response;
    }
    //Checar todos los folios aprobados de la base de datos
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAllPagosAprobadosRequest")
    @ResponsePayload
    public GetAllPagosAprobadosResponse manejarGetAllPagosAprobadoRequest(@RequestPayload GetAllPagosAprobadosRequest request){
        GetAllPagosAprobadosResponse response = new GetAllPagosAprobadosResponse();
        //Recibe una lista de todos los pagos aprobados que se encuentran en la base de datos
        return response;
    }

}