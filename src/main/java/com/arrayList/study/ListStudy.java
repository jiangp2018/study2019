package com.arrayList.study;

import org.junit.Test;

public class ListStudy {

    @Test
    public void subList() {
        List<String> list = new ArrayList();
        //list.set(-1,"123");
        for (int i = 0; i++ < 10; ) {
            list.add("list" + i);
        }
        //�e�`    ���ص��� ArrayList ���ڲ��� SubList�������� ArrayList ���� ArrayList ��һ����ͼ������ SubList ���б�����в������ջᷴӳ��ԭ�б��ϡ�
        //	ArrayList<String> subList =(ArrayList<String>) list.subList(0, list.size());
        List subList = list.subList(0, list.size());
        int[] array = {123, 456, 1, 2};
        //String array = "123";
        List<int[]> array2 = Arrays.asList(array);
        int arr = array2.get(0)[0];
        int[] array3 = {123};
        array[1] = 123456;
        // �����b�ɔ��M
        Object[] obj = list.toArray();
        obj[9] = "456123";
        // ���e
        //array2.add(array3);
    }

    //
    @Test
    public void addAll() {
        // rangeCheckForAdd(index);
        int[] src = {1, 2, 3, 4, 5};
        int[] newDest = {4, 5, 6, 70, 10};
        int[] newsSrc = Arrays.copyOf(src, 10);
        System.arraycopy(src, 0, newDest, 2, src.length);
        // newDest.length = src.length ;
        // Arrays.copyOf(src, newDest);
        // System.arraycopy(src, srcPos, dest, destPos, length);
        /*
         * {1,2,3,4,5,6,70 ,10 ,4,5}; Object[] a = c.toArray(); int numNew =
         * a.length; numNew=10; ensureCapacityInternal(size + numNew); //
         * Increments modCount
         * // int numMoved = size - index; numMoved=20-10; if (numMoved > 0)
         * System.arraycopy(elementData, index, elementData, index + numNew,
         * numMoved);
         * System.arraycopy(a, 0, elementData, index, numNew); size += numNew;
         * return numNew != 0;
         */
    }

    @Test
    public void removeData() {
        List<String> list = new ArrayList();
        for (int i = 0; i++ < 3; ) {
            list.add("list" + i);
        }
        for (String str : list) {
            if ("list1".equals(str)) {
                list.remove(str);
                System.out.println("str1");
            }

            if ("list2".equals(str)) {
                list.remove(str);
                System.out.println("str2");
            }
        }
    }

    public static void main(String[] args) {
        new ListStudy().testAddSpeed();
    }


    public void testAddSpeed() {
        ArrayList<String> arr = new ArrayList<>(5000);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            arr.add("a");
            arr.add("a1");
            arr.add("a5");
            arr.add("a4");
            arr.add("a3");
            arr.add("a2");
        }
        long end = System.currentTimeMillis();
        System.out.println("arrylist time:" + (end - start));


        LinkedList<String> link = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            link.add("a");
            link.add("a2");
            link.add("a1");
            link.add("a5");
            link.add("a4");
            link.add("a3");
        }

        end = System.currentTimeMillis();
        System.out.println("linkedlist time:" + (end - start));


    }

}
	
	

