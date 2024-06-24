package Endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import https.registro_uv_mx.contabilidad.PagoRequest;
import https.registro_uv_mx.contabilidad.PagoResponse;
import https.registro_uv_mx.contabilidad.PagosAprobadosResponse;
import https.registro_uv_mx.contabilidad.PagosAprobadosRequest;

@Endpoint
public class ContabilidadEndpoint {

    private static final String NAMESPACE_URI = "https://registro.uv.mx/contabilidad";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PagosAprobadosRequest")
    @ResponsePayload
    public PagosAprobadosResponse handlePagosAprobadosRequest(@RequestPayload PagosAprobadosRequest request) {
        PagosAprobadosResponse response = new PagosAprobadosResponse();
        
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PagoRequest")
    @ResponsePayload
    public PagoResponse handlePagoRequest(@RequestPayload PagoRequest request){
        PagoResponse response = new PagoResponse();
        response.setSuccess(true); // lógica del negocio
        return response;
    }
}