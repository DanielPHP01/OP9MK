package com.example.op9mk

class QuestionsBank {
    val getQuestions: List<QuestionsList>
        get() {
            val questionsLists: MutableList<QuestionsList> = ArrayList<QuestionsList>()

            val question1 = QuestionsList(
                "В каком году закончилась Первая мировая война?",
                "1917",
                "1918",
                "1818",
                "1817",
                "1918",
                ""
            )
            val question2 = QuestionsList(
                "Сколько звезд во флаге США", "13", "31", "50", "55", "50", ""
            )
            val question3 = QuestionsList(
                "Какое из этих животных НЕ относится к китайскому Зодиаку?",
                "Петух",
                "Обезьяна",
                "Свинья",
                "Слон",
                "Слон",
                ""
            )
            val question4 = QuestionsList(
                "В каком году Кыргызстан получил независимость от СССР?",
                "1990",
                "1991",
                "1989",
                "1988",
                "1991",
                ""
            )
            val question5 = QuestionsList(
                "В какой стране находится самый высокий водопад в Европе?",
                "Исландия ",
                "Финляндия ",
                "Швеция ",
                "Норвегия",
                "Норвегия",
                ""
            )

            val question6 = QuestionsList(
                "Какая столица Намибии?",
                "Уагадугу ",
                "Аккра ",
                "Виндхук ",
                "Кигали",
                "Виндхук ",
                ""
            )
            val question7 = QuestionsList(
                "В каком из этих городов самое большое население?",
                "Дели ",
                "Мехико ",
                "Шанхай ",
                "Сан-Паулу",
                "Шанхай ",
                ""
            )
            val question8 = QuestionsList(
                "Какой знак зодиака проходит с 23 августа по 22 сентября?",
                "Лев",
                "Рак",
                "Дева",
                "Весы",
                "Дева",
                ""
            )
            val question9 = QuestionsList(
                "Какой химический символ у золота?", "Au", "Ar", "Al", "As", "Au", ""
            )
            val question10 = QuestionsList(
                "Как зовут президента Кыргызстана вступившего в должность с 1 декабря 2011 года",
                "Асылбек Жээнбеков",
                "Алмазбек Атамбаев",
                "Роза Отунбаева",
                "Садыр Жапаров",
                "Алмазбек Атамбаев",
                ""
            )

            questionsLists.add(question1)
            questionsLists.add(question2)
            questionsLists.add(question3)
            questionsLists.add(question4)
            questionsLists.add(question5)
            questionsLists.add(question6)
            questionsLists.add(question7)
            questionsLists.add(question8)
            questionsLists.add(question9)
            questionsLists.add(question10)
            return questionsLists
        }
}