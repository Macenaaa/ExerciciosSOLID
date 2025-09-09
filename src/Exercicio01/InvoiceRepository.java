package Exercicio01;

public class InvoiceRepository implements Repository {


    @Override
    public void salvarNoBanco(Invoice inv) {
        try (java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/PROVA?useSSL=false&serverTimezone=UTC","root","mysqlPW")) {
            var ps = conn.prepareStatement("INSERT INTO invoice(id,total) VALUES (?,?)");
            ps.setString(1, inv.getId());
            ps.setDouble(2, inv.getTotal());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}

