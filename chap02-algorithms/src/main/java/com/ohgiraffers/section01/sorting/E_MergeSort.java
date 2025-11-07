package com.ohgiraffers.section01.sorting;

import java.util.Arrays;

/* 병합 정렬
 * 분할 정복(Divide and Conquer) 방식으로 배열을 반씩 나누어 정렬한 후 병합(Merge)하는 방식이다.
 * 정렬 된 두 개의 배열을 합치는 과정에서 안정 정렬(Stable Sort)의 특성을 유지할 수 있다.
 * 시간 복잡도는 항상 O(n log n)으로 일정하며, 최악의 경우에도 O(n log n)이다.
 * 하지만 추가 메모리 공간이 필요하므로 메모리 제한적 환경에서는 비효율적일 수 있다.
 * */
public class E_MergeSort {

    /* 문제 : n 개의 정수가 주어졌을 때 병합 정렬 알고리즘을 사용하여 오름차순으로 정렬하는 프로그램 작성 */

    public static void solution(int[] arr){

        System.out.println("원본 배열 : " + Arrays.toString(arr));
        int[] temp = new int[arr.length];   // 추가 메모리 공간
        mergeSort(arr, temp, 0, arr.length - 1);
        System.out.println("정렬된 배열 : " + Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if(left< right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
        }
    }
}
