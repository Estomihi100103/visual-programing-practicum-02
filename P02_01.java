<?xml version="1.0"?>
<flowgorithm fileversion="3.0">
    <attributes>
        <attribute name="name" value=""/>
        <attribute name="authors" value="Frima Guna Hutajulu"/>
        <attribute name="about" value=""/>
        <attribute name="saved" value="2023-10-01 02:49:56 PM"/>
        <attribute name="created" value="RnJpbWEgR3VuYSBIdXRhanVsdTtQT1BQWTsyMDIzLTEwLTAxOzAxOjUwOjExIFBNOzM0NzM="/>
        <attribute name="edited" value="RnJpbWEgR3VuYSBIdXRhanVsdTtQT1BQWTsyMDIzLTEwLTAxOzAyOjQ5OjU2IFBNOzg7MzYwNg=="/>
    </attributes>
    <function name="Main" type="None" variable="">
        <parameters/>
        <body>
            <declare name="namatugas, matakuliah, dosen, matkul, status, rekomendasitugas, kode" type="String" array="False" size=""/>
            <declare name="tingkatkesulitan, deadline" type="Integer" array="False" size=""/>
            <declare name="prioritas" type="Real" array="False" size=""/>
            <input variable="namatugas"/>
            <input variable="matakuliah"/>
            <input variable="dosen"/>
            <input variable="matkul"/>
            <input variable="status"/>
            <input variable="rekomendasitugas"/>
            <input variable="kode"/>
            <input variable="tingkatkesulitan"/>
            <input variable="deadline"/>
            <input variable="prioritas"/>
            <if expression="prioritas&gt;3.0">
                <then>
                    <assign variable="rekomendasitugas" expression="&quot;penting! anda harus mengerjakan tugas ini segera&quot;"/>
                </then>
                <else>
                    <if expression="prioritas&gt;=1.5 and prioritas&gt;3">
                        <then>
                            <assign variable="rekomendasitugas" expression="&quot;tugas ini memiliki prioritas menengah&quot;"/>
                        </then>
                        <else>
                            <if expression="prioritas&lt;1.5">
                                <then>
                                    <assign variable="rekomendasitugas" expression="&quot;tugas ini relatif ringan,namun jangan tunda terlalu lama&quot;"/>
                                </then>
                                <else/>
                            </if>
                        </else>
                    </if>
                </else>
            </if>
            <output expression="prioritas&amp;toxifed(prioritas,2)" newline="True"/>
            <output expression="namatugas&amp;&quot;|&quot;&amp;kode&amp;&quot;|&quot;&amp;matkul&amp;&quot;|&quot;&amp;dosen&amp;&quot;|&quot;&amp;deadline&amp;&quot;|&quot;&amp;kode&amp;&quot;|&quot;&amp;status&amp;&quot;|&quot;&amp;prioritas&amp;&quot;|&quot;&amp;rekomendasitugas" newline="True"/>
        </body>
    </function>
</flowgorithm>
