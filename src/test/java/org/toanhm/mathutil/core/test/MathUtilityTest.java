/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.toanhm.mathutil.core.test;

import com.toanhm.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * 
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        //assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
}   
   
}
//HỌC KĨ THUẬT KIỂM THỬ CHO DÂN DEV - KĨ THUẬT DDT
//DATA DRIVEN TESTING - bổ trợ cho việc xài unit test giúp các test case dễ đọc hơn, dễ bảo trì hơn
//phần mở rộng hơn của tdd 
// là kĩ thuật viết code kiểm thử mà tách bộ data kiểm thử ra 1 chổ khác 
//ra khỏi câu lệnh asserterquals() cho dễ kiểm soát test case

//TDD: TEST DRIVEN DEVELOPMENT
//KĨ THUẬT LẬP TRÌNH MÀ DÂN DEV VIẾT CODE ĐẾN ĐÂU THÌ VIẾT BỘ TEST CASE ĐẾN ĐÓ
//(JUNIT, NUNIT, MOCHA) và dùng 2 màu xanh đỏ để đảm bảo chất lượng hàm
//kĩ thuật tdd đã học xong

//ddt la phần mở rộng thêm của tdd túc là giúp cho code test (Unit Test)
//trở nên dễ dàng đọc, bảo trì, dễ dàng phá hiện thiếu test case

//DDT tách data kiểm thử ra 1 chổ riêng thường là mảng 2 chiều
//(có nhiều cột, các cột chính là data đưa vào chính là expected
// và ta cần có nhiều dòng như thế, ứng với các test case

//và mảng 2 chiều này fill/ đổ từ từ vào trong hàm ASSERTEQUALS()
//KĨ THUẬT TÁCH DATA TEST RIÊNG RA 1 CHỔ GỌI LÀ DDT
// DATA DRIVEN TESTING - VIẾT CODE TEST HƯỚNG VỀ VIỆC TÁCH DATA

//DATA ĐƯỢC ĐƯA VÀO TRỞ LẠI QUA CÁC THAM SỐ/BIẾN ĐẠI DIỆN
//NÊN DDT CÒN GỌI LÀ: PARAMETERIZED TESTING
//THAM SỐ HÓA CÁI DATA TEST, BIẾN DATA TEST THÀNH THAM SỐ VÀ
// ĐƯA VÀO HÀM ASSERTREQUALS()