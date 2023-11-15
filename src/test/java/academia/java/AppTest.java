package academia.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }

    @Test
    public void testFindUser() {
        Pessoa user = PessoaJPADAO.getInstance().findAll();
        assertNotNull(user);
        assertEquals("JohnDoe", user.getNome());
        assertEquals("john@example.com", user.getEmail());
    }

    @Test
    public void testUpdateUser() {
        Pessoa user = PessoaJPADAO.findUserById(1);
        user.setEmail("newemail@example.com");
        boolean result = PessoaJPADAO.updateUser(user);
        assertTrue(result);

        Pessoa updatedUser = PessoaJPADAO.findUserById(1);
        assertEquals("newemail@example.com", updatedUser.getEmail());
    }

    @Test
    public void testDeleteUser() {
        boolean result = PessoaJPADAO.deleteUser(1);
        assertTrue(result);

        Pessoa deletedUser = PessoaJPADAO.findUserById(1);
        assertNull(deletedUser);
    }

}
