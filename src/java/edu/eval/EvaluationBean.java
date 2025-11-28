/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eval;

/**
 *
 * @author zlkid
 */
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.sql.*;
import java.util.List;

@Named("evaluationBean")
@SessionScoped
public class EvaluationBean implements Serializable {
    
    private int id;

    private String q1;
    private String q2;
    private String q3;
    private String q4;
    private String q5;
    private String q6;
    private String q7;
    private String q8;
    private String q9;
    private String q10;
    private String q11;
    private String q12;
    private String q13;
    private String c2;
    private String q14;
    private String q15;
    private String q16;
    private String c3;
    private String q17;
    private String q18;
    private String q19;
    private String q20;
    private String q21;
    private String c4;
    private String q22;
    private String q23;
    private String q24;
    private String q25;
    private String c5;
    private String q26;
    private String q27;
    private String c6;
    private String s_best;
    private String s_least;
    private String i_changes;
    private String i_more;
    // a getter and setter for every question
    public String getQ1() {
        return q1;
    }
    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }
    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }
    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }
    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getQ5() {
        return q5;
    }
    public void setQ5(String q5) {
        this.q5 = q5;
    }

    public String getQ6() {
        return q6;
    }
    public void setQ6(String q6) {
        this.q6 = q6;
    }

    public String getQ7() {
        return q7;
    }
    public void setQ7(String q7) {
        this.q7 = q7;
    }

    public String getQ8() {
        return q8;
    }
    public void setQ8(String q8) {
        this.q8 = q8;
    }

    public String getQ9() {
        return q9;
    }
    public void setQ9(String q9) {
        this.q9 = q9;
    }

    public String getQ10() {
        return q10;
    }
    public void setQ10(String q10) {
        this.q10 = q10;
    }

    public String getQ11() {
        return q11;
    }
    public void setQ11(String q11) {
        this.q11 = q11;
    }

    public String getQ12() {
        return q12;
    }
    public void setQ12(String q12) {
        this.q12 = q12;
    }

    public String getQ13() {
        return q13;
    }
    public void setQ13(String q13) {
        this.q13 = q13;
    }

    public String getC2() {
        return c2;
    }
    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getQ14() {
        return q14;
    }
    public void setQ14(String q14) {
        this.q14 = q14;
    }

    public String getQ15() {
        return q15;
    }
    public void setQ15(String q15) {
       this.q15 = q15;
    }

    public String getQ16() {
        return q16;
    }
    public void setQ16(String q16) {
        this.q16 = q16;
    }

    public String getC3() {
        return c3;
    }
    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getQ17() {
        return q17;
    }
    public void setQ17(String q17) {
        this.q17 = q17;
    }

    public String getQ18() {
        return q18;
    }
    public void setQ18(String q18) {
        this.q18 = q18;
    }

    public String getQ19() {
        return q19;
    }
    public void setQ19(String q19) {
        this.q19 = q19;
    }

    public String getQ20() {
        return q20;
    }
    public void setQ20(String q20) {
        this.q20 = q20;
    }

    public String getQ21() {
        return q21;
    }
    public void setQ21(String q21) {
        this.q21 = q21;
    }

    public String getC4() {
        return c4;
    }
    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getQ22() {
        return q22;
    }
    public void setQ22(String q22) {
        this.q22 = q22;
    }

    public String getQ23() {
        return q23;
    }
    public void setQ23(String q23) {
        this.q23 = q23;
    }

    public String getQ24() {
        return q24;
    }
    public void setQ24(String q24) {
        this.q24 = q24;
    }

    public String getQ25() {
        return q25;
    }
    public void setQ25(String q25) {
        this.q25 = q25;
    }

    public String getC5() {
        return c5;
    }
    public void setC5(String c5) {
        this.c5 = c5;
    }

    public String getQ26() {
        return q26;
    }
    public void setQ26(String q26) {
        this.q26 = q26;
    }

    public String getQ27() {
        return q27;
    }
    public void setQ27(String q27) {
        this.q27 = q27;
    }

    public String getC6() {
        return c6;
    }
    public void setC6(String c6) {
        this.c6 = c6;
    }

    public String getS_best() {
        return s_best;
    }
    public void setS_best(String s_best) {
        this.s_best = s_best;
    }

    public String getS_least() {
        return s_least;
    }
    public void setS_least(String s_least) {
        this.s_least = s_least;
    }

    public String getI_changes() {
        return i_changes;
    }
    public void setI_changes(String i_changes) {
        this.i_changes = i_changes;
    }

    public String getI_more() {
        return i_more;
    }
    public void setI_more(String i_more) {
        this.i_more = i_more;
    }
    public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}
    //for the summary page, since the inputs were numbers we convert
    public String convert(String value) {
        if (value == null) {
            return "N/A";
        }
        switch (value) {
            case "5": return "Strongly Agree";
            case "4": return "Agree";
            case "3": return "Neutral";
            case "2": return "Disagree";
            case "1": return "Strongly Disagree";
            default: return value;
        }
    }
public String saveEvaluation() {
    System.out.println("saveEvaluation() called");
    try (Connection conn = DatabaseConnection.getConnection()) {
        if (conn == null) {
            System.out.println("connection is null!");
            return null;
        }
        conn.setAutoCommit(true);
        System.out.println("Connected ");
        //System.out.println(" Autocommit: " + conn.getAutoCommit());

        String sql = "INSERT INTO evaluation ("
            + "q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, "
            + "q11, q12, q13, c2, q14, q15, q16, c3, "
            + "q17, q18, q19, q20, q21, c4, q22, q23, q24, q25, "
            + "c5, q26, q27, c6, s_best, s_least, i_changes, i_more"
            + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        //bind in same order
        ps.setString(1, q1);
        ps.setString(2, q2);
        ps.setString(3, q3);
        ps.setString(4, q4);
        ps.setString(5, q5);
        ps.setString(6, q6);
        ps.setString(7, q7);
        ps.setString(8, q8);
        ps.setString(9, q9);
        ps.setString(10, q10);
        ps.setString(11, q11);
        ps.setString(12, q12);
        ps.setString(13, q13);
        ps.setString(14, c2);
        ps.setString(15, q14);
        ps.setString(16, q15);
        ps.setString(17, q16);
        ps.setString(18, c3);
        ps.setString(19, q17);
        ps.setString(20, q18);
        ps.setString(21, q19);
        ps.setString(22, q20);
        ps.setString(23, q21);
        ps.setString(24, c4);
        ps.setString(25, q22);
        ps.setString(26, q23);
        ps.setString(27, q24);
        ps.setString(28, q25);
        ps.setString(29, c5);
        ps.setString(30, q26);
        ps.setString(31, q27);
        ps.setString(32, c6);
        ps.setString(33, s_best);
        ps.setString(34, s_least);
        ps.setString(35, i_changes);
        ps.setString(36, i_more);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Recor added");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    // Redirect to summary.xhtml
    return "summary.xhtml?faces-redirect=true";
}
    public List<EvaluationBean> getEvaluations() {
        DatabaseOperations dbOps = new DatabaseOperations();
        return dbOps.getAllEvaluations();
    }
}
