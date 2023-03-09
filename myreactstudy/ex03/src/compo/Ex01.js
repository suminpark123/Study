//Ex01 컴포넌트를 이용해서
//다음과 같이 화면이 나오게끔 만들어 주세요


function Ex01(){

    const names=['눈사람','얼음','눈','바람','햇살'] ; //db에서 가져온데이터
    //nameList =>db에서 가져온 names를 태그형식의 규칙을 갖춰진 새로운 배열
    const nameList =names.map(function(data,index){
        return <li key={index}>{data}</li>
    });
    //key :map함수로 만들어진 각각의 li태그를 구분 지을수 있는 값(권장)
    //index : 각각태그들이 만들어지는 순서, map함수의 두번째 매개변수
    //첫번째 매개변수는 무조건 기존배열의 원소를 의미함
    //화살표함수
    //const nameList = names.map((data)=><li>{data}</li>);
    return(
        //컴포넌트 두번째 규칙 ->항상 하나의 태그로 묶여있어야한다.
        <>
        <ul>
            {nameList}
        </ul>
        </>


    );

}
export default Ex01;
