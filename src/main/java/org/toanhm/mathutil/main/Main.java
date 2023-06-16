/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.toanhm.mathutil.main;

import com.toanhm.mathutil.core.MathUtility;

/**
 *m
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // test case #1: check getF(n=0) tính 0!
        int n=0;
        long expected = 1;
        long actual; //=? chờ app trở về
        
        actual = MathUtility.getFactorial(n);
        
        //so sánh
        System.out.println(n + "! | expected: " + expected +
                               " | actual: " + actual);
        //test case#2
        System.out.println("1!" + " | expected: 1 "  +
                               " | actual: " + MathUtility.getFactorial(1));
        //test case 3
        System.out.println("5!  | expected: 120 "  +
                               " | actual: " + MathUtility.getFactorial(5));
        //test case 4
        System.out.println("4!   | expected: 24 "  +
                               " | actual: " + MathUtility.getFactorial(4));
        //test case 5
        System.out.println("-1!   | expected: Ngoại lệ vả vào mặt "  +
                               " | actual: ");
        MathUtility.getFactorial(-1);
        
        
    }
}
//CODE CHUẨN BỊ VIẾT, HAY ĐANG BIẾT, SẼ TIẾN HÀNH LUÔN CÁI VIỆC KIỂM THỬ
//TỨC LÀ VIẾT CODE ĐẾN ĐÂU, CÓ CODE KIỂM THỬ ĐẾN ĐÓ ĐỂ ĐẢM BẢO HÀM NÓ NGON
//KĨ THUẬT CODE VÀ TEST CODE SONG HÀNH VỚI NHAU, ĐAN XEN VỚI NHAU
//GỌI LÀ TDD - TEST DRIVEN DEVELOPMENT

//CODE ĐẾN ĐÂU TEST ĐẾN ĐÓ
//DEVELOPER và Qc CÓ NHỮNG THỨ GIỐNG NHAU, và có nhiều thứ khác nhau
//Dev: việc chính yếu và duy nhất là viết code để ra cái app
//QC: việc chính yếu, duy nhất là tìm bug từ app

//Cả 2: GIỐNG NHAU ĐIỀU DƯỚI ĐÂY
//Cả 2 đều phải tạo ra viietes ra phát triển các test case
//QC tạo test case để mô phỏng tình huống xài app của user
//Dev tạo ra test case để mô phỏng tính huống xài hàm, xài class
//của chính mình, hoặc mô phỏng tình huống xài hàm/app của ai đó/dev
//nào đó sau này
//Cả 2 giống nhau là đều tạo test case và run test case để kết luận app đúng hàm đúng hay sai!!!!

// bây giờ chúng ta sẽ làm các test case cho hàm getF() ở vai trò dev

//Test case là 1 bộ data(gôm input và expected) dùng để mô phỏng
// cách xài hàm, xài app của 1 ai đó dùng để verify/ kiểm thử xem
// output của hàm/ app có giống với expected hay ko

//bộ test case cho hàm getF()
//có 2 cách viết test case, viết tự do và viết formal. chuẩn mực
//Viết tự do: nghĩ sao viết vậy
//          các test case cho hàm getF() là
//                  0! -> 1; 1! -> 1; 2! -> 2; 5! -> 120

//viết theo chuẩn mực: viết theo template, gôm các info sau

//test case #1( mục đích của test case): check getF() with n= 0
//Steps/Procedures ( các bước run test case): đứa inpur, và click gì đó
//      1.Given n=0
//      2.Execute/ Call the function/method getF(with n), e.g. getD(n=1)
//Expected result:
//              getF(n=5) must return 120