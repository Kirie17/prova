import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ValidadorUsuarioTest {

    @Test
    public void testEmailValido() {

        String emailValido = "email@dominio.com";
        assertTrue(ValidadorUsuario.validarEmail(emailValido));
    }

    @Test
    public void testEmailInvalidoSemArroba() {

        String emailInvalido = "email.com";
        assertFalse(ValidadorUsuario.validarEmail(emailInvalido));
    }

    @Test
    public void testEmailInvalidoFormato() {

        String emailInvalido = "email@dominio";
        assertFalse(ValidadorUsuario.validarEmail(emailInvalido));
    }
}
