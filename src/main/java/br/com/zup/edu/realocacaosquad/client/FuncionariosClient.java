package br.com.zup.edu.realocacaosquad.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
    name = "funcionariosClient",
    url = "${integrations.resource-server.url}"
)
public interface FuncionariosClient {

    @GetMapping("/api/funcionarios")
    public List<FuncionarioResponse> lista();

}
