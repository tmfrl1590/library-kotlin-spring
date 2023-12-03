package com.group.libraryapp.domain.book

import javax.persistence.*

@Entity
class Book(

    val name: String,

    @Enumerated(EnumType.STRING) // 문자열로 저장됨 , 엔티티에 Enum 쓸떄는 이 어노테이션을 꼭 붙이자. (안붙이면 숫자로 들어가기 때문에 순서바뀌거나 하면 난리남)
    val type: BookType,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
) {

    init {
        if(name.isBlank()){
            throw IllegalArgumentException("이름은 비어 있을 수 없습니다")
        }
    }

    companion object {
        fun fixture(
            name: String = "책 이름",
            type: BookType = BookType.COMPUTER,
            id: Long? = null,
        ): Book{
            return Book(
                name = name,
                type = type,
                id = id,
            )
        }
    }
}