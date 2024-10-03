public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

public interface FormacaoAcademicaRepository extends JpaRepository<FormacaoAcademica, Long> {
}

public interface ExperienciaProfissionalRepository extends JpaRepository<ExperienciaProfissional, Long> {
}

public interface HabilidadeRepository extends JpaRepository<Habilidade, Long> {
}

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
