

package org.joda.time.tz;

import org.joda.time.chrono.GJChronology;
import org.junit.Assert;
import org.joda.time.ReadablePeriod;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutputStream;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import java.io.InputStream;
import org.junit.Test;
import org.joda.time.chrono.LenientChronology;
import java.io.OutputStream;
import org.joda.time.ReadableInstant;
import org.joda.time.Period;
import org.joda.time.chrono.ZonedChronology;

public class DateTimeZoneBuilder_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(2801L);
        Assert.assertTrue(boolean0);
    }

    //@Test(timeout = 4000)
    public void test01() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        GJChronology gJChronology0 = GJChronology.getInstance(((DateTimeZone) (cachedDateTimeZone0)));
        LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
        ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, cachedDateTimeZone0);
        Period period0 = Period.days(7);
        Period period1 = period0.plusDays(7);
        long long0 = zonedChronology0.add(((ReadablePeriod) (period1)), 1800000L, (-1075));
        Assert.assertEquals((-1300314600000L), long0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 3214);
        dateTimeZoneBuilder0.addCutover(83, 's', 2, 88, 0, false, (-837));
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(3214, 's', 7, 83, 7, true, 1342);
        Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.addRecurringSavings("", 10, 10, 1011, 's', 10, (-2614), 2538, true, 10);
        dateTimeZoneBuilder0.toDateTimeZone("dn8F2n/0`lGRXy#:o", true);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        try {
            DateTimeZoneBuilder.readMillis(((DataInput) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        try {
            DateTimeZoneBuilder.readFrom(((InputStream) (null)), "NoLimit");
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(703, '!', 703, 703, 703, true, 783);
        Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    //@Test(timeout = 4000)
    public void test31() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        String string0 = cachedDateTimeZone0.getName((-9223372036854775796L));
        Assert.assertEquals("+00:09:21", string0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 4063);
        dateTimeZoneBuilder1.addCutover(4063, 's', 7, 10, 7, true, 1342);
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder1.toDateTimeZone("H", false)));
        Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Types array must not contain null", (-2147483647), (-2147483647), (-2147483647), 'w', (-2147483647), (-2147483647), 4099, false, 4099);
        Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.addRecurringSavings("", 10, 10, 10, 's', 10, 10, 2538, false, 10);
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder0.toDateTimeZone("dn8F2n/`lRXy#:o", false)));
        Assert.assertEquals("dn8F2n/`lRXy#:o", fixedDateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", (-5), 1751, (-5), '3', 1751, (-5), (-2285), true, 96);
        Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("UTC", 251);
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder0.toDateTimeZone("UTC", true)));
        Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder0.toDateTimeZone("UTC", true)));
        Assert.assertEquals("UTC", fixedDateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream0 = new DataOutputStream(((OutputStream) (byteArrayOutputStream0)));
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 60000L);
        Assert.assertEquals(4, byteArrayOutputStream0.size());
        Assert.assertEquals("@  ", byteArrayOutputStream0.toString());
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(9223310204521975818L);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isFixed();
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("|", 0);
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder0.toDateTimeZone("UTC", true)));
        Assert.assertEquals("UTC", fixedDateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        DateTime dateTime0 = DateTime.now(((DateTimeZone) (cachedDateTimeZone0)));
        dateTime0.plusMonths(77);
    }

    //@Test(timeout = 4000)
    public void test33() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        DateTime dateTime0 = DateTime.now(((DateTimeZone) (cachedDateTimeZone0)));
        int int0 = cachedDateTimeZone0.getOffset(((ReadableInstant) (dateTime0)));
        Assert.assertEquals(7200000, int0);
    }
}

