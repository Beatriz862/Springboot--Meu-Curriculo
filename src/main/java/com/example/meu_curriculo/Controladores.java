@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }

    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa obterPessoaPorId(@PathVariable Long id) {
        return pessoaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public Pessoa atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoaAtualizada) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        pessoa.setNome(pessoaAtualizada.getNome());
        pessoa.setEmail(pessoaAtualizada.getEmail());
        pessoa.setTelefone(pessoaAtualizada.getTelefone());
        return pessoaRepository.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public void removerPessoa(@PathVariable Long id) {
        pessoaRepository.deleteById(id);
    }
}