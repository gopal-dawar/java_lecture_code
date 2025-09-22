package array;

public class Demo1 {
	public static void main(String[] args) {

		// homogeneous array

		System.out.println("========== homogeneous array ===============");

		int[] rollNo = { 11, 12, 13, 14, 15 };
		System.out.println(rollNo[1]);
		System.out.println("Length of array : " + rollNo.length);

		for (int i = 0; i < rollNo.length; i++) {
			System.out.println(rollNo[i]);
		}
		// 0,1,2,3,4
		// array has fixed length = 5,
		// we can not increase length of array
		// new roll no = 16

		// rollNo[6] = 16;
		// System.out.println(rollNo[6]);

		// homegeneous array it's mean you store only one type of data
		// hetero array -> elements of different type of data store

		// Parent of all classes is object class
		// every class is dereived from object class
		// we can store all primitive and non-primitive datatype in object [class]

		// hetrogeneous array
		System.out.println("================== hetrogeneous array =================");
		Object[] heteraArray = { 12, "ss", 23.233, false };

		System.out.println(heteraArray[0]);
		System.out.println(heteraArray[1]);
		System.out.println(heteraArray[2]);
		System.out.println(heteraArray[3]);

		for (int i = 0; i < heteraArray.length; i++) {
			System.out.println(heteraArray[i]);
		}

		System.out.println("=========== reverse ============");
		for (int i = heteraArray.length - 1; i >= 0; i--) {
			System.out.println(heteraArray[i]);
		}

		System.out.println("odd number in given array ");
		int[] rollNo1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < rollNo1.length; i++) {
			if (rollNo1[i] % 2 != 0) {
				System.out.println(rollNo1[i]);
			}
		}

		System.out.println("even number in given array");
		for (int i = 0; i < rollNo1.length; i++) {
			if (rollNo1[i] % 2 == 0) {
				System.out.println(rollNo1[i]);
			}
		}

	}
}
