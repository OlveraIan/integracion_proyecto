package Endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.registro_uv_mx.contabilidad.AfectacionPresupuestalRequest;
import https.registro_uv_mx.contabilidad.AfectacionPresupuestalResponse;
import https.registro_uv_mx.contabilidad.PagoRequest;
import https.registro_uv_mx.contabilidad.PagoResponse;

@Endpoint
public class ContabilidadEndpoint {

    private static final String NAMESPACE_URI = "https://registro.uv.mx/contabilidad";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AfectacionPresupuestalRequest")
    @ResponsePayload
    public AfectacionPresupuestalResponse handleAfectacionPresupuestalRequest(@RequestPayload AfectacionPresupuestalRequest request) {
        AfectacionPresupuestalResponse response = new AfectacionPresupuestalResponse();
        System.out.println(request.getFolio());
        System.out.println(response.isSuccess());
        return response;
    }

    /* @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PagoRequest")
    @ResponsePayload
    public PagoResponse handlePagoRequest(@RequestPayload PagoRequest request) {
        PagoResponse response = new PagoResponse();
        response.setSuccess(true); // lógica del negocio
        return response;
    } */
}