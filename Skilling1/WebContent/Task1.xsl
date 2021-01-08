<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/Students">
		<html>
			<body>

				<h1 align="center">Student Table</h1>

				<table border="1" align="center" bgcolor="yellow">
					<tr>
						<th bgcolor="green">Student_ID</th>
						<th bgcolor="green">Student_Name</th>
						<th bgcolor="green">Student_Email</th>
						<th bgcolor="green">Student_Marks</th>
						<th bgcolor="green">Student_Class</th>
					</tr>
					<xsl:for-each select="student">
						<tr>
							<td>
								<xsl:value-of select="idno" />
							</td>
							<td>
								<xsl:value-of select="name" />
							</td>
							<td>
								<xsl:value-of select="email" />
							</td>
							<td>
								<xsl:value-of select="marks" />
							</td>
							<td>
								<xsl:value-of select="class" />
							</td>
						</tr>
					</xsl:for-each>
				</table>

			</body>


		</html>

	</xsl:template>
</xsl:stylesheet>