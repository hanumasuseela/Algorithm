import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest{
    @Test
    public void TestBinary(){
        assertEquals(BinarySearch.BinarySearch(new int[]{1, 2, 3, 4, 5},6),-1);
        assertEquals(BinarySearch.BinarySearch(new int[]{1, 2, 3, 4, 5},2),1);
        assertEquals(BinarySearch.BinarySearch(new int[]{1, 2, 3, 4, 5},3),2);
        assertEquals(BinarySearch.BinarySearch(new int[]{1, 2, 3, 4, 5},4),3);
        assertEquals(BinarySearch.BinarySearch(new int[]{1, 2, 3, 4, 5},5),4);

    }
}
