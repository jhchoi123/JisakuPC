function signup() {
    const userId = $("#signup-id").val();

    // ユーザーIDがもう使われているかをチェックする ajax処理
    $.ajax({
        type: "POST",
        dataType: "json",
        url: "signup-check.json",
        data: {
            id: userId
        },
        success: function (data) {
            const result = data.isAlreadyUsedId;

            if (result) {        // もう使われている場合 エラーメッセージを出力
                $(".warning-text").text("もう使われているIDです。");
            } else {            // 問題ない場合 転送する
                submitForm();
            }
        },
        error: function (data) {
            console.log("Some Error Occurred");
        }
    });
}

function submitForm() {
    $("#signup-form").submit();
}