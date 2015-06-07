$(document).ready(function () {

    loadAddresses();

    $('#add-button').click(function (event) {
        event.preventDefault();

        $.ajax({
            type: 'POST',
            url: 'address',
            data: JSON.stringify({
                firstName: $('#add-first-name').val(),
                lastName: $('#add-last-name').val(),
                streetAddress: $('#add-street-address').val(),
                city: $('#add-city').val(),
                state: $('#add-state').val(),
                zipCode: $('#add-zipCode').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-firstName').val('');
            $('#add-lastName').val('');
            $('#add-streetAddress').val('');
            $('#add-city').val('');
            $('#add-state').val('');
            $('#add-zipCode').val('');
            loadAddresses();
        });
    });

    $('#edit-button').click(function (event) {

        event.preventDefault();

        $.ajax({
            type: 'PUT',
            url: 'address/' + $('#edit-id').text(),
            data: JSON.stringify({
                addressId: $('#edit-id').val(),
                firstName: $('#edit-firstName').val(),
                lastName: $('#edit-lastName').val(),
                streetAddress: $('#edit-streetAddress').val(),
                city: $('#edit-city').val(),
                state: $('#edit-state').val(),
                zipCode: $('#edit-zipCode').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function () {
            loadAddresses();
        });
    });



});

function loadAddresses() {

    var aTable = $('#contentRows');
    
    
    
    $.ajax({
        url: 'addresses'
    }).success(function (data, status) {
        $.each(data, function (index, address) {
            aTable.append($('<tr>')
                    .append($('<td>')
                            .attr({
                                'data-address-id': address.id,
                                'data-toggle': 'modal',
                                'data-target': '#detailsModal'
                            }).text(address.firstName + '' + address.lastName)
                            )
                    )
                    .append($('<td>').text(address.state))
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-address-id': address.id,
                                        'data-toggle': 'modal',
                                        'data-target': '#editModal'
                                    }).text('Edit')
                                    )
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'onClick': 'deleteAddress('+ address.id + ')'
                                    }).text('Delete')
                                    )
                            );
        });
    });
}

function deleteAddress(id) {
    var answer = confirm("Do you really want to delete this Address?");
    
    if(answer === true){
        $.ajax({
            type: 'DELETE',
            url: 'address/' + id
        }).success(function () {
            loadAddresses();
        });
    }


}

function clearAddressTable() {
    $('contentRows').empty();
};

$('#detailsModal').on('show.bs.modal', function (event) {

    var element = $(event.relatedTarget);
    var addressId = element.data('address-id');
    var modal = $(this);

    $.ajax({
        type: 'GET',
        url: 'address/' + addressId
    }).success(function (address) {
        modal.find('#address-id').text(address.id);
        modal.find('#address-firstName').text(address.firstName);
        modal.find('#address-lastName').text(address.lastName);
        modal.find('#address-streetAddress').text(address.streetAddress);
        modal.find('#address-city').text(address.city);
        modal.find('#address-state').text(address.state);
        modal.find('#address-zipCode').text(address.zipCode);
    });


});

$('#editModal').on('show.bs.modal', function (event) {

    var element = $(event.relatedTarget);
    var addressId = element.data('address-id');

    var modal = $(this);

    $.ajax({
        type: 'GET',
        url: 'address/' + addressId
    }).success(function (address) {
        modal.find('#edit-id').text(address.id);

        modal.find('#edit-id').val(address.id);
        modal.find('#edit-firstName').val(address.firstName);
        modal.find('#edit-lastName').val(address.lastName);
        modal.find('#edit-streetAddress').val(address.streetAddress);
        modal.find('#edit-city').val(address.city);
        modal.find('#edit-state').val(address.state);
        modal.find('#edit-zipCode').val(address.zipCode);
    });

});