package br.com.zup.edu.realocacaosquad.funcionarios;

import br.com.zup.edu.realocacaosquad.client.FuncionariosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class ListaFuncionariosPorCargoController {

    @Autowired
    private FuncionariosClient client;

    @GetMapping("/api/funcionarios")
    public ResponseEntity<?> listaPorCargo(@RequestParam CargoDoFuncionario cargo) {

        if (cargo == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "filtro de cargo deve ser informado");
        }

        List<FuncionarioFiltradoResponse> funcionarios = client.lista().stream()
                                .filter(f -> cargo.name().equals(f.getCargo().name()))
                                .map(funcionario -> new FuncionarioFiltradoResponse(funcionario))
                                .collect(toList());

        return ResponseEntity
                    .ok(funcionarios);
    }
}
