学习笔记

```
// 1.冒泡排序
public int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}
```

```
// 2.插入排序
public int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int preIndex = i - 1;
        int current = arr[i];
        while (preIndex >= 0 && arr[preIndex] > current) {
            arr[preIndex + 1] = arr[preIndex];
            preIndex--;
        }
        arr[preIndex + 1] = current;
    }
    return arr;
}
```

```
// 3.归并排序
public static void mergeSort(int[] arr, int l, int r) {
    if (l >= r) {
        return;
    }
    int mid = (l + r) >> 1;
    mergeSort(arr, l, mid);
    mergeSort(arr, mid + 1, r);
    merge(arr, l, mid, r);
}

private static void merge(int[] arr, int l, int mid, int r) {
    int[] temp = new int[r - l + 1];
    int i = l, j = mid + 1, k = 0;
    while (i <= mid && j <= r) {
        temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
    }
    while (i <= mid) {
        temp[k++] = arr[i++];
    }
    while (j <= r) {
        temp[k++] = arr[j++];
    }
    System.arraycopy(temp, 0, arr, l, temp.length);
}
```

```
// 4.选择排序
public int[] selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    return arr;
}
```

```
// 5.快速排序
public static void quickSort(int[] arr, int left, int right) {
    if(left >= right) return;
    int pivot = arr[left];  // 基准点
    int i = left;
    int j = right;
    while (i < j) {
        while (arr[j] >= pivot && i < j) {      // 优先从右边走，保证相遇点是小于基准点的
            j--;
        }
        while (arr[i] <= pivot && i <j) {
            i++;
        }
        if(i <j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    arr[left] = arr[i];
    arr[i] = pivot;
    quickSort(arr, left, i -1);
    quickSort(arr, i + 1, right);
}
```

```
// 6.堆排序
public static void heapSort(int[] arr) {
    // 将原始数据构建成大顶堆（升序-大顶堆，降序-小顶堆）
    for (int i = arr.length / 2 - 1; i >= 0; i--) {
        siftDown(arr, i, arr.length);
    }
    for (int i = arr.length - 1; i > 0; i--) {
        // 交换堆顶与数组最左侧值
        swap(arr, 0, i);
        siftDown(arr, 0, i);
    }

}

/**
 * 下沉调整大顶堆
 *
 * @param arr
 * @param i
 * @param length
 */
private static void siftDown(int[] arr, int i, int length) {
    int half = length >> 1;
    int key = arr[i];
    while (i < half) {
        int child = (i << 1) + 1;
        int rightChild = child + 1;
        if (rightChild < length && arr[rightChild] > arr[child]) {    // 取子节点的较大值
            child = rightChild;
        }
        if (arr[i] >= arr[child]) {   // 满足最大堆特性，无需调整
            break;
        }
        // 交换子父节点
        arr[i] = arr[child];
        i = child;
        arr[i] = key;
    }
}

private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```