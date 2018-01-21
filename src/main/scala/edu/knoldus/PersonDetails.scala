package edu.knoldus

//scalastyle:off
@SerialVersionUID(153)
//scalastyle:on
class PersonDetails(val name: String, val age: Int, @transient val day: String,
                    val adress: AddressInformation, val salary: Int,
                    @transient val luckyNo: Int) {

}
