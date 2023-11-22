package mao.moneyutils;

import mao.moneyutils.utils.MoneyUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Project name(项目名称)：word-to-pdf
 * Package(包名): mao.wordtopdf.utils
 * Class(测试类名): MoneyUtilsTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/22
 * Time(创建时间)： 12:44
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class MoneyUtilsTest
{

    @Test
    void dealMoney()
    {
        String dealMoney = MoneyUtils.dealMoney(101);
        System.out.println(dealMoney);
        assertEquals("壹佰零壹圆整", dealMoney);
    }

    @Test
    void dealMoney2()
    {
        String dealMoney = MoneyUtils.dealMoney(102);
        System.out.println(dealMoney);
        assertEquals("壹佰零贰圆整", dealMoney);
    }

    @Test
    void dealMoney3()
    {
        String dealMoney = MoneyUtils.dealMoney(11);
        System.out.println(dealMoney);
        assertEquals("壹拾壹圆整", dealMoney);
    }

    @Test
    void dealMoney4()
    {
        String dealMoney = MoneyUtils.dealMoney(8);
        System.out.println(dealMoney);
        assertEquals("捌圆整", dealMoney);
    }

    @Test
    void dealMoney5()
    {
        String dealMoney = MoneyUtils.dealMoney(3573);
        System.out.println(dealMoney);
        assertEquals("叁仟伍佰柒拾叁圆整", dealMoney);
    }

    @Test
    void dealMoney6()
    {
        String dealMoney = MoneyUtils.dealMoney(95246);
        System.out.println(dealMoney);
        assertEquals("玖万伍仟贰佰肆拾陆圆整", dealMoney);
    }


    @Test
    void dealMoney7()
    {
        String dealMoney = MoneyUtils.dealMoney(567853256);
        System.out.println(dealMoney);
        assertEquals("伍亿陆仟柒佰捌拾伍万叁仟贰佰伍拾陆圆整", dealMoney);
    }

    @Test
    void dealMoney8()
    {
        String dealMoney = MoneyUtils.dealMoney(0);
        System.out.println(dealMoney);
        assertEquals("零圆", dealMoney);
    }

    @Test
    void dealMoney9()
    {
        String dealMoney = MoneyUtils.dealMoney(-2);
        System.out.println(dealMoney);
        assertEquals("null", dealMoney);
    }

    @Test
    void testDealMoney()
    {
        String dealMoney = MoneyUtils.dealMoney("23");
        System.out.println(dealMoney);
        assertEquals("贰拾叁圆整", dealMoney);
    }

    @Test
    void testDealMoney1()
    {
        String dealMoney = MoneyUtils.dealMoney(657895214756L);
        System.out.println(dealMoney);
        assertEquals("陆仟伍佰柒拾捌亿玖仟伍佰贰拾壹万肆仟柒佰伍拾陆圆整", dealMoney);
    }

    @Test
    void testDealMoney2()
    {
        String dealMoney = MoneyUtils.dealMoney(28.245f);
        System.out.println(dealMoney);
        assertEquals("贰拾捌圆贰角肆分", dealMoney);
    }



    @Test
    void testDealMoney3()
    {
        String dealMoney = MoneyUtils.dealMoney(28.5d);
        System.out.println(dealMoney);
        assertEquals("贰拾捌圆伍角零分", dealMoney);
    }

    @Test
    void testDealMoney4()
    {
        String dealMoney = MoneyUtils.dealMoney(28.78f);
        System.out.println(dealMoney);
        assertEquals("贰拾捌圆柒角捌分", dealMoney);
    }

    @Test
    void testDealMoney5()
    {
        String dealMoney = MoneyUtils.dealMoney(28.763245d);
        System.out.println(dealMoney);
        assertEquals("贰拾捌圆柒角陆分", dealMoney);
    }

    @Test
    void cutFrontZeros()
    {
        String dealMoney = MoneyUtils.cutFrontZeros("0.23546");
        System.out.println(dealMoney);
        assertEquals(".23546", dealMoney);
    }

    @Test
    void cutFrontZeros2()
    {
        String dealMoney = MoneyUtils.cutFrontZeros("23");
        System.out.println(dealMoney);
        assertEquals("23", dealMoney);
    }

    @Test
    void cutFrontZeros3()
    {
        String dealMoney = MoneyUtils.cutFrontZeros("0.00025");
        System.out.println(dealMoney);
        assertEquals(".00025", dealMoney);
    }
}

