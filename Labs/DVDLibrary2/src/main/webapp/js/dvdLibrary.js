$(document).ready(function () {

    loadDvds();

    $('#add-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'dvd',
            data: JSON.stringify({
                title: $('#add-title').val(),
                releaseDate: $('#add-release-date').val(),
                mpaaRating: $('#add-mpaa-rating').val(),
                director: $('#add-director').val(),
                studio: $('#add-studio').val(),
                note: $('#add-note').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-title').val('');
            $('#add-release-date').val('');
            $('#add-mpaa-rating').val('');
            $('#add-director').val('');
            $('#add-studio').val('');
            $('#add-note').val('');
            loadDvds();
        });
    });
    
    $('#edit-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'PUT',
            url: 'dvd/' + $('#edit-id').val(),
            data: JSON.stringify({
                id: $('#edit-id').val(),
                title: $('#edit-title').val(),
                releaseDate: $('#edit-releaseDate').val(),
                mpaaRating: $('#edit-mpaaRating').val(),
                director: $('#edit-director').val(),
                studio: $('#edit-studio').val(),
                note: $('#edit-note').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function () {
            loadDvds();
        });
    });

});


function loadDvds() {
    
    clearDvdTable();

    var dTable = $('#contentRows');

    $.ajax({
        url: 'dvds'
    }).success(function (data, status) {
        $.each(data, function (index, dvd) {
            dTable.append($('<tr>')
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-dvd-id': dvd.id,
                                        'data-toggle': 'modal',
                                        'data-target': '#detailsModal'
                                    }).text(dvd.title)
                                    )
                            )
                    .append($('<td>').text(dvd.mpaaRating))
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-dvd-id': dvd.id,
                                        'data-toggle': 'modal',
                                        'data-target': '#editModal'
                                    }).text('Edit')
                                    )
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'onClick': 'deleteDvd(' + dvd.id + ')'
                                    }).text('Delete')
                                    )
                            )
                    );
        });
    });
}

function deleteDvd(id) {
    var answer = confirm("Do you really want to delete this contact?");

    if (answer === true) {
        $.ajax({
            type: 'DELETE',
            url: 'dvd/' + id
        }).success(function () {
            loadDvds();
        });
    }
}

function clearDvdTable() {
    $('#contentRows').empty();
}

$('#detailsModal').on('show.bs.modal', function (event) {

    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);

    $.ajax({
        type: 'GET',
        url: 'dvd/' + dvdId
    }).success(function (dvd) {
        modal.find('#dvd-id').text(dvd.id);
        modal.find('#dvd-title').text(dvd.title);
        modal.find('#dvd-releaseDate').text(dvd.releaseDate);
        modal.find('#dvd-mpaaRating').text(dvd.mpaaRating);
        modal.find('#dvd-director').text(dvd.director);
        modal.find('#dvd-studio').text(dvd.studio);
        modal.find('#dvd-note').text(dvd.note);
    });
});

$('#editModal').on('show.bs.modal', function (event) {

    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);

    $.ajax({
        type: 'GET',
        url: 'dvd/' + dvdId
    }).success(function (dvd) {
        modal.find('#dvd-id').text(dvd.id);

        modal.find('#edit-id').val(dvd.id);
        modal.find('#edit-title').val(dvd.title);
        modal.find('#edit-releaseDate').val(dvd.releaseDate);
        modal.find('#edit-mpaaRating').val(dvd.mpaaRating);
        modal.find('#edit-director').val(dvd.director);
        modal.find('#edit-studio').val(dvd.studio);
        modal.find('#edit-note').val(dvd.note);
    });

});





var testDvdData = [
    {
        dvdId: 1,
        title: 'Movie1',
        releaseDate: '2001-12-03',
        mpaaRating: 'PG-13',
        director: 'Spielberg',
        studio: 'Hollywood',
        note: 'funny'
    }
];



var dummyDetailsDvd =
        {
            dvdId: 42,
            title: 'First Movie',
            releaseDate: '2001-12-04',
            mpaaRating: 'G',
            director: 'Director',
            studio: 'Hollywood',
            note: 'great'
        };


 