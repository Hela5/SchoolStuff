$(document).ready(function () {

    loadContacts();

});

function loadContacts() {
    var cTable = $('#contentRows');

    $.each(testContactData, function (index, contact) {
        cTable.append($('<tr>')
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-contact-id': contact.contactId,
                                    'data-toggle': 'modal',
                                    'data-target': '#detailsModal'
                                }).text(contact.firstName + ' ' + contact.lastName)
                                )
                        )
                .append($('<td>').text(contact.company))
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-contact-id': contact.contactId,
                                    'data-toggle': 'modal',
                                    'data-target': '#editModal'
                                }).text('Edit')
                                )
                        )
                .append($('<td>').text('Delete'))
                );
    });
}


$('#detailsModal').on('show.bs.modal', function (event) {

    var element = $(event.relatedTarget);

    var contactId = element.data('contact-id');

    // PLACEHOLDER
    var modal = $(this);
    modal.find('#contact-id').text(contactId);
    modal.find('#contact-firstName').text(dummyDetailsContact.firstName);
    modal.find('#contact-lastName').text(dummyDetailsContact.lastName);
    modal.find('#contact-company').text(dummyDetailsContact.company);
    modal.find('#contact-phone').text(dummyDetailsContact.phone);
    modal.find('#contact-email').text(dummyDetailsContact.email);
});

$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var contactId = element.data('contact-id');

    var modal = $(this);
    modal.find('#contact-id').text(contactId);
    modal.find('#edit-first-name').val(dummyDetailsContact.firstName);
    modal.find('#edit-last-name').val(dummyDetailsContact.lastName);
    modal.find('#edit-company').val(dummyDetailsContact.company);
    modal.find('#edit-phone').val(dummyDetailsContact.phone);
    modal.find('#edit-email').val(dummyDetailsContact.email);


});


///////////////////////
///   TEST DATA    ////
///////////////////////

var testContactData = [
    {
        contactId: 1,
        firstName: 'Susan',
        lastName: 'Williams',
        company: 'IBM',
        email: 'Swilliams@ibm.com',
        phone: '123-321-2343'
    },
    {
        contactId: 2,
        firstName: 'George',
        lastName: 'Smith',
        company: 'PNC',
        email: 'gSmith@PNC.com',
        phone: '123-564-3453'
    },
    {
        contactId: 3,
        firstName: 'Chuck',
        lastName: 'Knowbloch',
        company: '3M',
        email: 'chuck@3M.com',
        phone: '345-453-6657'
    }
];

var dummyDetailsContact =
        {
            contactId: 42,
            firstName: 'Kent',
            lastName: 'Hrbek',
            company: '3M',
            email: 'kent@3M.com',
            phone: '234-837-4958'
        };