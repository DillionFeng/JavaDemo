import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args){
        /*
            某班级考试完毕，班级共有5个学生，总共考试了三门课程
            问：求每门课程的平均分和最高分(总分)
         */

        Scanner scanner=new Scanner(System.in);
        double[][] scores=new double[3][3];//二维数组
        //录入成绩：
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                System.out.println("请输入第"+(i+1)+"个同学的第"+(j+1)+"门成绩：");
                scores[i][j]=scanner.nextDouble();
            }
        }

        //计算每门平均分
        double[] avgArr=new double[3];//没门课程的总分
        double[] userSum=new double[3];//每位学员的总分

        System.out.println("我是分割线**************************************");
        //输出录入的成绩
        //遍历每位学员
        for(int i=0;i<scores.length;i++){
//            System.out.println(Arrays.toString(arr));
            int sum=0;//每位学员的总分

            //遍历每位学员的每一门成绩
            for(int j=0;j<scores[0].length;j++){
//                System.out.print("i="+i+",j="+j);
                sum+=scores[i][j];
            }
            userSum[i]=sum;//学员总分
        }



        //计算没门课程的平均分
        int sum1=0;//每课程的总分  scores[0][0]+scores[1][0]+scores[2][0]+...+scores[4][0]
        for(int m=0;m<scores[0].length;m++){// 0,1,2
            sum1=0;//恢复0
            for(int n=0;n<scores.length;n++){//0,1
//                System.out.print("m="+m+",n="+n);
                sum1+=scores[n][m];
            }
            avgArr[m]=sum1;//将没门成绩总分存入
        }

        //输出
        Arrays.sort(userSum);
        System.out.println("学员第一名总分为："+userSum[userSum.length-1]);

        System.out.println(Arrays.toString(avgArr));//平均分
        //输出没门课程他平均分
        for(int a=0;a<avgArr.length;a++){
            System.out.println("第"+(a+1)+"门成绩的平均分为："+avgArr[a]/3);
        }
    }
}
