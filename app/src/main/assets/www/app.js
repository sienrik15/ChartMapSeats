$(document).ready(function() {
    /*$('.search-panel .dropdown-menu').find('a').click(function(e) {
        e.preventDefault();
        var param = $(this).attr("href").replace("#","");
        var concept = $(this).text();
        $('.search-panel span#search_concept').text(concept);
        $('.input-group #search_param').val(param);
    });

    var card = $(".clones");
    for (var index = 0; index < 5; index++) {
        card.clone().appendTo(".sectionPrimer");
    }*/
    var cont = 0;
    var cont1 = 0;
    var color = "";
    var color1 = "";

    $('#XMLID_65_').on('click', function(){
        var javaScriptObject = {id:"DSE-093", state:"0", type:"General", position:"CD23"};
        if(cont1==0){
            cont1 = 1;
            color1 = "#17af25";
            JoinnusMobile.setCheckSeat(JSON.stringify(javaScriptObject));

        }else{
            cont1 = 0;
            color1 = "#AEAEAE";
            JoinnusMobile.setUnCheckSeat(JSON.stringify(javaScriptObject));
        }
        $(this).find('.available').css({ fill:color1 });
        JoinnusMobile.showToast("Asiento Selecionado 1");
        //alert("Asiento Selecionado 1");
    });

    $('#XMLID_754_').on('click', function(){
        var javaScriptObject = {"id":"XDV-094", "state":"0", "type":"General", "position":"CD29"};
        if(cont==0){
            cont = 1;
            color = "#17af25";
            JoinnusMobile.setCheckSeat(JSON.stringify(javaScriptObject));
        }else{
            cont = 0;
            color = "#AEAEAE";
            JoinnusMobile.setUnCheckSeat(JSON.stringify(javaScriptObject));
        }
        $(this).find('.available').css({ fill:color });
        JoinnusMobile.showToast("Asiento Selecionado 2");
        //alert("Asiento selecionado 2");
    });


});


