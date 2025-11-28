/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eval;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author zlkid
 */

public class DatabaseOperations {
    public void saveEvaluation(EvaluationBean eval) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DatabaseConnection.getConnection();
            if (conn == null) {
                System.out.println("connection is null");
                return;
            }
            //using preparedStatement, should make it clearer to insert
            String sql = "INSERT INTO evaluation ("
                    + "q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, "
                    + "q11, q12, q13, c2, q14, q15, q16, c3, "
                    + "q17, q18, q19, q20, q21, c4, q22, q23, q24, q25, "
                    + "c5, q26, q27, c6, s_best, s_least, i_changes, i_more"
                    + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, eval.getQ1());
            ps.setString(2, eval.getQ2());
            ps.setString(3, eval.getQ3());
            ps.setString(4, eval.getQ4());
            ps.setString(5, eval.getQ5());
            ps.setString(6, eval.getQ6());
            ps.setString(7, eval.getQ7());
            ps.setString(8, eval.getQ8());
            ps.setString(9, eval.getQ9());
            ps.setString(10, eval.getQ10());
            ps.setString(11, eval.getQ11());
            ps.setString(12, eval.getQ12());
            ps.setString(13, eval.getQ13());
            ps.setString(14, eval.getC2());
            ps.setString(15, eval.getQ14());
            ps.setString(16, eval.getQ15());
            ps.setString(17, eval.getQ16());
            ps.setString(18, eval.getC3());
            ps.setString(19, eval.getQ17());
            ps.setString(20, eval.getQ18());
            ps.setString(21, eval.getQ19());
            ps.setString(22, eval.getQ20());
            ps.setString(23, eval.getQ21());
            ps.setString(24, eval.getC4());
            ps.setString(25, eval.getQ22());
            ps.setString(26, eval.getQ23());
            ps.setString(27, eval.getQ24());
            ps.setString(28, eval.getQ25());
            ps.setString(29, eval.getC5());
            ps.setString(30, eval.getQ26());
            ps.setString(31, eval.getQ27());
            ps.setString(32, eval.getC6());
            ps.setString(33, eval.getS_best());
            ps.setString(34, eval.getS_least());
            ps.setString(35, eval.getI_changes());
            ps.setString(36, eval.getI_more());
            ps.executeUpdate();
            System.out.println("Record added");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    public List<EvaluationBean> getAllEvaluations() {
        //using an arraylist just for ease of use
        List<EvaluationBean> evaluations = new ArrayList<>();
        String sql = "SELECT * FROM evaluation ORDER BY id DESC";

        try (Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            EvaluationBean e = new EvaluationBean();
            //probably a quicker way to do this? idk
            e.setId(rs.getInt("id"));
            e.setQ1(rs.getString("q1"));
            e.setQ2(rs.getString("q2"));
            e.setQ3(rs.getString("q3"));
            e.setQ4(rs.getString("q4"));
            e.setQ5(rs.getString("q5"));
            e.setQ6(rs.getString("q6"));
            e.setQ7(rs.getString("q7"));
            e.setQ8(rs.getString("q8"));
            e.setQ9(rs.getString("q9"));
            e.setQ10(rs.getString("q10"));
            e.setQ11(rs.getString("q11"));
            e.setQ12(rs.getString("q12"));
            e.setQ13(rs.getString("q13"));
            e.setC2(rs.getString("c2"));
            e.setQ14(rs.getString("q14"));
            e.setQ15(rs.getString("q15"));
            e.setQ16(rs.getString("q16"));
            e.setC3(rs.getString("c3"));
            e.setQ17(rs.getString("q17"));
            e.setQ18(rs.getString("q18"));
            e.setQ19(rs.getString("q19"));
            e.setQ20(rs.getString("q20"));
            e.setQ21(rs.getString("q21"));
            e.setC4(rs.getString("c4"));
            e.setQ22(rs.getString("q22"));
            e.setQ23(rs.getString("q23"));
            e.setQ24(rs.getString("q24"));
            e.setQ25(rs.getString("q25"));
            e.setC5(rs.getString("c5"));
            e.setQ26(rs.getString("q26"));
            e.setQ27(rs.getString("q27"));
            e.setC6(rs.getString("c6"));
            e.setS_best(rs.getString("s_best"));
            e.setS_least(rs.getString("s_least"));
            e.setI_changes(rs.getString("i_changes"));
            e.setI_more(rs.getString("i_more"));
            evaluations.add(e);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return evaluations;
    }
}