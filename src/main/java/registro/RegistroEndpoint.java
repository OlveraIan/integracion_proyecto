package registro;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import https.registro_uv_mx.registro.AfectacionPresupuestalRequest;
import https.registro_uv_mx.registro.AfectacionPresupuestalResponse;
import https.registro_uv_mx.registro.PagoRequest;
import https.registro_uv_mx.registro.PagoResponse;

@Endpoint
public class RegistroEndpoint {

    private static final String NAMESPACE_URI = "https://registro.uv.mx/registro";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AfectacionPresupuestalRequest")
    @ResponsePayload
    public AfectacionPresupuestalResponse handleAfectacionPresupuestalRequest(@RequestPayload AfectacionPresupuestalRequest request) {
        AfectacionPresupuestalResponse response = new AfectacionPresupuestalResponse();
        response.setSuccess(true); // lógica del negocio
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PagoRequest")
    @ResponsePayload
    public PagoResponse handlePagoRequest(@RequestPayload PagoRequest request) {
        PagoResponse response = new PagoResponse();
        response.setSuccess(true); // lógica del negocio
        return response;
    }
}
