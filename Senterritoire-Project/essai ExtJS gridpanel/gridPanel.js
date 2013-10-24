Ext.onReady(function(){
    
    var mesChampsDeDonnees = [
        {name: 'numero_enregistrement'},
        {name: 'nom_enregistrement'},
        {name: 'date_creation',type:'date',dateFormat:'Y-m-d'},
	{name: 'doc'}
    ];
    
    var mesDonnees = {
        rows:[
            {numero_enregistrement: 1,nom_enregistrement: 'Premier enregistrement',date_creation: '2011-03-13',doc:'Document1.pdf'},
            {numero_enregistrement: 2,nom_enregistrement: 'Deuxieme enregistrement',date_creation: '2011-03-14',doc:'Document2.pdf'},
            {numero_enregistrement: 3,nom_enregistrement: 'Troisième enregistrement',date_creation: '2011-03-15',doc:'Document3.pdf'}
        ]
    }
    
    
    var monStore = new Ext.data.JsonStore({
        root: 'rows',
        idProperty: 'numero_enregistrement',
        fields:mesChampsDeDonnees,
        data:mesDonnees
    });
    
    
    var mesColonnes = [
        {header: 'Identifiant', width: 200, dataIndex: 'numero_enregistrement',sortable: true},
        {header: 'Nom', width: 200, dataIndex: 'nom_enregistrement',sortable: true},
        {header: 'Date', width: 200, dataIndex: 'date_creation',xtype:'datecolumn',format:'d/m/Y',sortable: true},
	{header: 'Document', width: 200, dataIndex: 'doc',sortable: true}
    ];
    
    var monGridPanel = new Ext.grid.GridPanel({
	width:800,
        autoHeight:true,
        renderTo:Ext.getBody(),
        store: monStore,
        columns:mesColonnes,
	sm: new Ext.grid.RowSelectionModel
	({
            singleSelect: true//Une seule ligne sélectionnable à la fois
        })
    });
    
    var selModel = monGridPanel.getSelectionModel();
    
      selModel.on('rowselect',
	  function()
	    { 
	   /* Ext.MessageBox.alert("Clicked!","You Clicked row!");*/
	    
	   /* var getData = monGridPanel.getSelectionModel().getSelected();
    		alert(getData.get('doc'));*/


	    
	    /*Ext.MessageBox.alert("Amayas!","You Clicked row!");*/
	  /* var mConfig = { 
		  mediaType   :'PDFFRAME', 
		  url         : '/home/amayas/Téléchargements/tutoriel_hibernate.pdf',//pdf file path
		  unsupportedText : 'Acrobat Viewer is not Installed',
		  autoSize : true
	    };                  
	    var p = new Ext.ux.MediaWindow({		  
		  id            : 'PDFViewerWin',
		  bodyStyle    : 'position:relative; padding:0px;',
		  width        : 600,
		  height        : 400,
		  mediaCfg    : mConfig,
		  title        : 'Title-1'
	     }).show();*/
	   
	  new Ext.Window({
    height: 750,
    width: 850,
    bodyCfg: {
        tag: 'iframe',
        src: '/home/amayas/Téléchargements/tutoriel_hibernate.pdf',//pdf file path
        style: 'border: 0 none'
    },
    modal: true
}).show();  
	   
	  });

      monGridPanel.show();
}); 
