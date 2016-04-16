function ajax() {
    var ref = $('#ref');
    $.ajax({
        type: 'DELETE',
        url: ref.attr('value')
    });
}