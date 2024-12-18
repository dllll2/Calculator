# [Spring 4기] CH 2 계산기 과제


> ## LV1 while, switch case 를 이용한 간단한 계산기
> <details>
> <summary>App.java</summary>
>
> ![LV1_App](https://github.com/user-attachments/assets/42e1bbb4-bd89-4f47-b38f-60fa1e2925a1)
> </details>
>
> ## LV2 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기
>>  + ## **Calculator.java**<br>
>>   <details>
>>   <summary>calculator() 메소드를 통해서 계산을 진행하고 결과값을 resultList에 저장.<br></summary>
>>
>>   ![LV2_calculator()](https://github.com/user-attachments/assets/603e7204-bba8-46ee-93a1-128462526caf)
>>  </details>
>>  <details>
>>   <summary>getResultList() getter메소드를 통해서 결과값이 저장된 resultList의 복사본을 반환한다.<br></summary>
>>
>>  ![LV2_gerResultList()](https://github.com/user-attachments/assets/7d913310-3dbd-432b-8b56-0b7bbd7191ac)
>>   </details>
>>   <details>
>>  <summary>removeResult() 메소드를 통해서 리스트의 값을 삭제한다</summary>
>>
>>  ![LV2_removeResult()](https://github.com/user-attachments/assets/cbf279ba-6882-4869-bc96-3e377152c08b)
>> </details>
>>
>>   <details>
>>   <summary>Calculator.java 전체 코드</summary>
>>
>>   ![LV2_Calculator](https://github.com/user-attachments/assets/d29305ad-7592-463e-ab9c-d0c1f03fe25c)
>>   </details>
>
>> + ## **App.java**<br>
>>  <details>
>>  <summary>App.java</summary>
>>
>>  ![LV2_App](https://github.com/user-attachments/assets/7bca3e16-5888-44ed-ba00-3aa3674fc968)
>>  </details>
>
>> ## LV3 Enum, 제네릭, 람다 & 스트림 적용
>> + ## **OperatorType.java**<br>
>><details>
>> <summary>Enum 클래스에 계산을 진행하는 calculate 추상 메소드를 구현</summary>
>>
>>![LV3_abstract_calculate()](https://github.com/user-attachments/assets/8f529efc-fcfb-4436-a7bc-4791bc575f3b)
>>![LV3_Override_example](https://github.com/user-attachments/assets/1075fed4-f4ab-48ed-9778-3b483ef22171)
>></details>
>>  <details>
>>  <summary>OperatorType.java 전체 코드</summary>
>>
>>  ![LV3_OperatorType](https://github.com/user-attachments/assets/dc5bfa95-47f0-4a1e-a815-2111cb8993e4)
>>  </details>
>
>> + ## **ArithmeticCalculator.java**<br>
>><details>
>> <summary>람다, 스트림으로 입력받은 값보다 큰수를 출력하는 biggerValue() 메서드 구현</summary>
>>
>>![LV3_LambdaAndStream_biggerValue()](https://github.com/user-attachments/assets/44a38a56-ca02-4ba8-8ae0-02685a2bb0db)
>></details>
>>  <details>
>>  <summary>ArithmeticCalculator.java 전체 코드</summary>
>>
>>  ![LV3_ArithmeticCalculator](https://github.com/user-attachments/assets/1769aea1-aee0-4a02-9ea6-265f2d6b264a)
>>  </details>
>
>> + ## **App.java**<br>
>><details>
>><summary>App.java</summary>
>>
>>![LV3_Apppng](https://github.com/user-attachments/assets/469d885f-8607-4e4c-8ac5-f99bf9daaff0)
>></details>
